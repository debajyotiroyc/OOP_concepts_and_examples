class Car:
    mileage=100 #class variable
    seats = 4 #class variable
    
    def __init__(self,model):
        self.model = model #instance variable
    #self.var is not a class variable any more even though var was(if...)
    def show(self):
        self.mileage+=100 #however milegae was a class variable but this change will be local only to the respective instances since self.var was used.
        self.model+="10"
    
    mileage+=50
    seats+= 1

ob1 = Car("Audi")
ob2 = Car("Mercedes")

ob1.show()
print(ob1.mileage,ob1.model,ob1.seats)
ob1.show()
print(ob2.mileage,ob2.model,ob1.seats)#change not seen in case of mileage
print(Car.mileage,Car.seats)
#since seats value was changed without any self obj hence that will be global