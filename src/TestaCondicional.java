public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("Testanto condicionais");
        int idade = 16;
        int quantidadePessoas = 3;

        //se
        if (idade >= 18){
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        } else { //senão
            if(quantidadePessoas >= 2){
                System.out.println("Você não tem 18, mas pode entrar, pois está acompanhando");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }
        }
    }
}
