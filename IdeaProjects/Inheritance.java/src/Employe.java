
public class Employe {
    int salary = 50000;

    class Engineer extends Employe {
        int benefits = 40000;
    }

    class GFg {
        public  void main(String[] args) {
            Engineer engineer=new Engineer();

            System.out.println("name"+engineer.salary +"benefits"+engineer.benefits);

        }
    }
}