public class Car {
   static double carPrice=10000;
    String color;

     void calculateSalePrice(){}
}

class Sedan extends Car {

    double calculatSalePrice(double length){
        if(length>20){
            return carPrice*.5;
        }else{
            return carPrice*.10;
        }


    }
}

class Truck extends Car {
    double calculateSalePrice( double weight){

        if(weight >2000){
            return carPrice *.10;
        }else{
            return carPrice*.20;
        }

    }
}