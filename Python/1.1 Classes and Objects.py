class Car:
    #Constructor
    def __init__(self,c,s):
        self.col = c 
        self.seats = s
    
    def show(self):
        print("Colour is:",self.col)
        print("Seat Count is:",self.seats)
    
ob = Car("Blue",4)#object creation
ob.col #"Blue"
ob.seats #4
ob.show()