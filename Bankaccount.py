class Bankaccount():
  def Account(self,name,amount):
    self.name=name
    self.amount=amount
    print(f"Your name is {self.name},Your Opening balance is {self.amount} ")
  def Deposit(self,amount):
    self.amount+=amount
    print(f"You deposit {amount} rupees")
  def Withdrawl(self,amount):
    self.amount-=amount
    print(f"You withdraw {amount} ruppes")

  def display(self):
    print(f"Hello {name} your final balance is {self.amount}")
bc=Bankaccount()
name=input("Enter your name: ")
amount=int(input("Enter amount: "))
w_amount=int(input("Enter withdraw amount "))
d_amount=int(input("Deposit amount: "))
bc.Account(name,amount)
bc.Deposit(d_amount)
bc.Withdrawl(w_amount)
bc.display()
