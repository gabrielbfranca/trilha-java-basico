public class BancoTerminal {

    public static void main(String[] args) {
        
        double saldo = 25;

        
        double valorSolicitado = 18;

        
        if (saldo >= valorSolicitado) {
            
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        
        saldo = 15;
        valorSolicitado = 22;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
