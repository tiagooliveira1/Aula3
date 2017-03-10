import com.opet.util.Reader;
public class aula03
{

    public static void main(String[] args) throws Exception
    {
        while(true) {
         // TODO Auto-generated method stub
            System.out.print("Salario:");
            double aliquota = 0;
            double salario = Reader.readDouble();
            if( salario <= 1903.98)
                aliquota=0;
            else if ( salario <= 2826.65)
                aliquota=7.5;
            else if ( salario <= 3751.05)
                aliquota=15;
            else if ( salario <= 4664.08)
                aliquota=22.5;
            else
                aliquota=27.5;

            if(aliquota==0) {
                System.out.println("Salário:"+salario+" Isento de IR!");
            } else {
                System.out.println("Salário:"+salario+" Alíquota:"+aliquota+
                                "% -  IR a pagar:"+(salario*(aliquota/100)));
            }
        }


    }

}
