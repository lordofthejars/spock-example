import spock.lang.*

@Unroll
class DataDrivenSpec extends Specification {
    def "maximum of two numbers"() {
        given:
        AccountService service = new AccountService()

        when:
        service.transfer(from, to, amount)

        then:
        from.balance == fromBalance
        to.balance == toBalance

        where:
        from                      || to                        || amount || fromBalance || toBalance
        new Account(balance: 100) || new Account(balance: 100) || 10     || 90          || 110
    }

    static class AccountService {
        void transfer(Account from, Account to, int amount) {
            from.balance -= amount
            to.balance += amount
        }
    }

    static class Account {
        int balance
    }
}
