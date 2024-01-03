Bank Account Management System
This repository contains Java code for a simple bank account management system. It includes classes representing different types of bank accounts and a Bank class to manage these accounts.

Structure
Bank class: Manages a list of bank accounts and provides methods to perform operations on these accounts.
BankAccount abstract class: Serves as the base class for different types of bank accounts.
SavingsAcct class: Represents a savings account, implementing specific behaviors and interest calculation.
ChequingAcct class: Represents a checking account with its functionalities.
InvestmentAcct class: Represents an investment account with its specialized behaviors.
Operations Supported
addAccount: Adds a new bank account (Savings, Checking, or Investment) to the bank.
depositInterestToAllAccounts: Adds interest to each account based on its type.
printOutAllAccounts: Displays the status of all accounts in a formatted manner.
getAcctByAcctNumber: Retrieves an account by its account number.
deposit: Deposits money into an account using its account number.
Usage
Creating a Bank: Instantiate the Bank class.
Adding Accounts: Use addAccount to add different types of accounts to the bank.
Performing Operations: Deposit interest using depositInterestToAllAccounts, print account status using printOutAllAccounts, etc.

Notes
Ensure to handle edge cases or exceptions that might occur during operations.
Feel free to expand functionalities or create new types of accounts by extending the BankAccount class.





은행 계좌 관리 시스템
이 저장소에는 간단한 은행 계좌 관리 시스템을 위한 Java 코드가 포함되어 있습니다. 각종 은행 계좌를 나타내는 클래스와 이러한 계좌들을 관리하는 'Bank' 클래스가 포함되어 있습니다.

구조
'Bank' 클래스: 은행 계좌 목록을 관리하고 이러한 계좌들에 대한 작업을 수행하는 메서드를 제공합니다.
'BankAccount' 추상 클래스: 각종 은행 계좌의 기본 클래스 역할을 합니다.
'SavingsAcct' 클래스: 저축 계좌를 나타내며 특정한 동작과 이자 계산을 구현합니다.
'ChequingAcct' 클래스: 수표 계좌를 나타내며 해당하는 기능을 구현합니다.
'InvestmentAcct' 클래스: 특별한 동작을 가진 투자 계좌를 나타냅니다.
지원하는 작업
'addAccount': 은행에 새로운 은행 계좌(저축, 수표, 투자)를 추가합니다.
'depositInterestToAllAccounts': 각 계좌에 해당하는 계좌 유형에 기반하여 이자를 추가합니다.
'printOutAllAccounts': 모든 계좌의 상태를 서식에 맞게 표시합니다.
'getAcctByAcctNumber': 계좌 번호로 계좌를 검색합니다.
'deposit': 계좌 번호를 사용하여 계좌에 돈을 입금합니다.
사용 방법
은행 생성: 'Bank' 클래스를 인스턴스화합니다.
계좌 추가: 'addAccount'를 사용하여 다양한 유형의 계좌를 은행에 추가합니다.
작업 수행: 'depositInterestToAllAccounts'를 사용하여 이자를 입금하거나 'printOutAllAccounts'를 사용하여 계좌 상태를 출력합니다.

참고 사항
작업 중에 발생할 수 있는 예외 사항이나 경계 상황을 처리해야 합니다.
'BankAccount' 클래스를 확장하여 기능을 확장하거나 새로운 계좌 유형을 만들어도 괜찮습니다.
