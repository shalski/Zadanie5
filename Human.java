public class Human{
    String Name;
    String Surname;
    Animal pet;
    private Car car;
    private Double salary = 0.0;
    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return this.salary;
    }
    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Ale jak to tak ujemne konto?");
        }
        else{
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Koniecznośc odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
        }
    }
    public Car getCar(){
        return this.car;
    }

    public void setCar(Car newCar){
        if(this.salary > newCar.price){
            System.out.println("Udało się kupić samochod, juz przypisujemy.");
            this.car = newCar;
        }
        else if(this.salary > (newCar.price)/12){
            System.out.println("Udało się kupić samochód na kredyt, juz przypisujemy.");
            this.car = newCar;
        }
        else{
            System.out.println("Panie, z tymi zarobkami to rower mozemy zaproponowac");
        }
    }
}
