import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin {
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;


        void roshan() {
            System.out.println("mashinroshan ast");
            ayaMashinRoshanAst=true;

        }

        void khamosh() {
            System.out.println("mashin khamosh ast");
            ayaMashinRoshanAst=false;
        }

        void bazKardnDar() {
            System.out.println(" dar baz ast");
            ayaDarMashinBazAst=true;
        }

        void bastnDar() {
            System.out.println("dar baste shod");
            ayaDarMashinBazAst=false;
        }
        void harekat(){
            if (!ayaDarMashinBazAst && ! ayaMashinRoshanAst){
                System.out.println("mashin dar hale harekat ast");
            }else {
                System.out.println("mashin park ast");
            }
        }

    }
}

