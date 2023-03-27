
import java.util.Scanner;
public class Atividades {
  Scanner sc = new Scanner(System.in);
  public void AtividadeIMC(){
    System.out.println("Informe seu Nome: ");
    String nome = sc.nextLine();
    System.out.println("Informe sua idade:");
    int idade = sc.nextInt();
    System.out.println("Informe o número de seu sexo (1 - Masculino  2 - Feminino)");
    int sexo = sc.nextInt();
    System.out.println("Informe o seu peso:");
    double peso = sc.nextDouble();
    System.out.println("Informe sua altura:");
    double altura = sc.nextDouble();
    
    double pesoIdeal = 00;

    if(sexo==1){
        pesoIdeal = (72.7*altura)-58;
    }else{
        pesoIdeal = (62.1*altura)-44.7;

    } 
    System.out.println("Seu peso ideal é "+pesoIdeal+"Kg");

    double imc = peso / (altura*altura);
    String tipoAtividade;
    if(imc < 20){
     tipoAtividade = "Atividade Dificil"; 

    }else if(imc>27){
        tipoAtividade = "Atividade Leve";

    }else{
        tipoAtividade = "Atividade Moderada";
    }
    System.out.println("Sua Dificuldades:"+tipoAtividade);

   
    String faixaEtaria;
    if(idade <=25){
        faixaEtaria = "idade I";

    }else if (idade >=25 && idade <=35){
        faixaEtaria = "idade II";


    }else if (idade >=36 && idade <=45){
        faixaEtaria = "idade III";

    }else if (idade >=46 && idade <=55){
        faixaEtaria = "idade IV";

    }else if (idade>=56 && idade <=65){
        faixaEtaria = "idade V";

    }else {
        faixaEtaria = "idade VI";
    }
    System.out.println("Sua Faixa Etaria:"+faixaEtaria);
    System.out.println("Suas Atividades:");
    if(tipoAtividade =="Atividade Dificil" && faixaEtaria=="idade II" || faixaEtaria=="idade III"){
        System.out.println("Você poderá fazer Muscalação Intensa");

    }
    if (tipoAtividade =="Atividade Moderada" && faixaEtaria=="idade I" || faixaEtaria=="idade II" || faixaEtaria=="idade III" || faixaEtaria=="idade IV"){
        System.out.println("Você poderá fazer Muscalação Moderada");

    }
    if (tipoAtividade =="Atividade Leve" && faixaEtaria=="idade I" || faixaEtaria=="idade IV" || faixaEtaria=="idade V" || faixaEtaria=="idade VI"){
        System.out.println("Você poderá fazer Muscalação Leve");


    }
    if (tipoAtividade =="Atividade Dificl" && faixaEtaria=="idade I" || faixaEtaria=="idade II" || faixaEtaria=="idade III" || faixaEtaria=="idade IV"){
        System.out.println("Você poderá fazer Luta"); 

}
if (tipoAtividade =="Atividade Moderada" && faixaEtaria=="idade I" || faixaEtaria=="idade II" || faixaEtaria=="idade III" || faixaEtaria=="idade IV" || faixaEtaria=="idade V" || faixaEtaria=="idade VI"){
    System.out.println("Você poderá fazer Dança");

}
if (tipoAtividade =="Atividade Dificil" && faixaEtaria=="idade VI" || faixaEtaria=="idade V" || faixaEtaria=="idade VI"){
    System.out.println("Você poderá fazer Pilates");

    }
    if (tipoAtividade =="Atividade Moderada" && faixaEtaria=="idade II" || faixaEtaria=="idade III" || faixaEtaria=="idade IV" || faixaEtaria=="idade V"){
        System.out.println("Você poderá fazer Corrida");
    }
    if (tipoAtividade =="Atividade Leve"){
        System.out.println("Você poderá fazer Ioga");
        }
     
}
}

