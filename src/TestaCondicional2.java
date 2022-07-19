public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testanto condicionais");
        // boolean = true ou  false

        int idade = 20;
        int quantidadePessoas = 3;
        //boolean acompanhado = true;
        boolean acompanhado = quantidadePessoas >=2;

        //se idade >= 18 OU(||) quanditdadePessoas >=2
        //se idade >= 18 E(&&) quanditadePessoas >=2
        if (idade >= 18 && acompanhado == true){
            System.out.println("Seja bem vindo");
            System.out.println("Valor de acompanhado = " + acompanhado);
        } else { //senão
            System.out.println("Infelizmente você não pode entrar");
        }




    }
}
