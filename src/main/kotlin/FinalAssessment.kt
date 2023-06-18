fun main(){
    var accountType = ""
    var userChoice: Int
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    while (accountType == ""){
        println("Choose an option (1,2 or 3)")
        userChoice = (1..5).random()
        println("The selected option is $userChoice")
        accountType = when (userChoice){
            1 -> {
                "debit"
            }

            2 -> {
                "credit"
            }

            3 -> {
                "checking"
            }

            else ->{
                continue
            }
        }
    }
    println("You have created a $accountType account")
    var accountBalance = (0..1000).random()
    println("The current balance is $accountBalance dollars")
    val money = (0..1000).random()
    println("The amount you transferred is $money dollars")
    var output: Int
    fun withdraw(amount: Int):Int{
        accountBalance -= amount
        println("You successfully withdrew $amount dollars. The current balance is $accountBalance")
        return amount
    }
    output = withdraw(money)
    println("The amount you withdrew is $output dollars.")
    fun debitWithdraw(amount:Int):Int{
        return if(accountBalance == 0){
            println("Can't withdraw, no money on this account!")
            accountBalance
        } else{
            if(amount > accountBalance){
                println( "Not enough money on this account! The checking balance is $accountBalance dollars.")
                0
            } else{
                withdraw(amount)
            }

        }
    }
    output = debitWithdraw(money)
    println("The amount you withdrew is $output dollars.")
    fun deposit(amount: Int):Int{
        accountBalance += amount
        println("You successfully deposit $amount dollars. The current balance is $accountBalance dollars.")
        return amount
    }
    output = deposit(money)
    println("The amount you deposited is $output dollars.")
    fun creditDeposit(amount: Int):Int{
        if (accountBalance == 0){
            println("This account is completely paid off! Do not deposit money!")
            return accountBalance
        }
        else{
            return if(accountBalance+amount > 0){
                println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
                0
            } else{
                if (amount == -accountBalance){
                    accountBalance = 0
                    println("You have paid off this account!")
                    amount
                } else{
                    deposit(amount)
                }
            }
        }
    }
    output = creditDeposit(money)
    println("The amount you deposited is $output dollars.")
    fun transfer(mode: String){
        val transferAmount: Int
        when(mode){
            "withdraw"->{
                transferAmount = if (accountType == "debit"){
                    debitWithdraw(money)
                } else{
                    withdraw(money)
                }
                println("The amount you withdrew is $transferAmount dollars.")
            }
            "deposit" ->{
                transferAmount = if (accountType == "credit"){
                    creditDeposit(money)
                } else{
                    deposit(money)
                }
                println("The amount you deposited is $transferAmount dollars.")
            }
            else -> return
        }
    }
    var isSystemOpen = true
    var option: Int
    while (isSystemOpen){
        println("What would you like to do?")
        println("1. Check bank account balance")
        println("2. Withdraw money")
        println("4. Close the app")
        println("3. Checking account")
        println("Which option do you choose? (1, 2, 3 or 4)")
        option = (1..5).random()
        println("The selected option is ${option}.")
        when(option){
            1 -> println("The current balance is $accountBalance dollars.")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("The system is closed")
            }
            else -> continue
        }
    }



}
