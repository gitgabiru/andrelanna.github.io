---
title: Exercício prático
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
### Dupla: Gabriel Alves   15/0009917    
###      : Iago Neres      15/0011831
------

Atividade para realizar em dupla e entregar via GitHub. Uma entrega por dupla.
Prazo para entrega: ~~4/4/2017~~ 10/04/2017, 23:59:59.

Nome da Dupla:
Gabriel Alves Soares de Souza - 15/0009917
Iago Neres Oliveira           - 15/0011831

**Questão 1:** Os termos abaixo estão relacionados ao paradigma de *Orientação por Objetos*. Defina cada um dos termos com base no livro-texto (Eck, David J. Introduction to Programming Using Java, 6th ed. 2011).
* classe:
	
Classe é uma estrutura criada pelo programador contendo características e comportamentos comuns a um objeto. Em outras palavras, é um molde, do qual passará a ser criados objetos que seguirão o padrão definido na classe. Classes descrevem objetos.

* objeto:

É uma coleção de variáveis e métodos. É a instância de uma classe. Objetos podem ser criados e destruídos no decorrer da execução do programa.

* elementos de classe:

Existe dois elementos em classe, Estado e Comportamento. Estado refere-se aos atributos, características da classe e o comportamento está ligado ás ações que essa classe faz.

* atributos:

Atributos são características de uma classe. São as variáveis de que caracterizam o objeto instanciado.

* métodos:

Métodos são subrotinas que caracterizam os comportamentos do objeto.

* método construtor padrão:

É o método que cria os objetos. Ele é responsável pela alocação de memória e pela inicialização dos atributos de instância, que vão ser iniciados com valores nulos.

* método construtor alternativo:

Possui a mesma função do Método construtor padrão, porém ele instancia um objeto de maneira diferente, o construtor alternativo cria um objeto passando parâmetros, ou seja, dando valor aos seus atributos.

* estado de um objeto:

Os atributos de instância é o estado de um objeto, ou seja, os valores atribuídos aos atributos do objeto representam seu estado.

* retenção de estado:

A retenção de estado permite que o estado (valores dos atributos) do objeto possa ficar intacto, até que seja solicitado alguma alteração em algum dos valores dos atributos do objeto.



**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais.

Falso. Dois objetos instanciados através do método construtor padrão terão o mesmo estado, porém, suas referências não serão iguais. Apesar de serem do mesmo construtor, os objetos referenciam diferentes endereços de memória do computador.

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos. 

Falso. Uma classe pode possuir mais de um método construtor alternativo, podendo variar, por exemplo, a quantidade de parâmetros que se passa no método.

c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.

Verdadeiro. A retenção de estado permite que o estado (valores dos atributos) do objeto possa ficar intacto, até que seja solicitado alguma alteração em algum dos valores.

d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 

Falso. Em java, o operador . (ponto) serve tanto para acessar atributos quanto para acessar métodos de um objeto.

e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.

Falso. Em java, não existe o método destrutor. Há o garbage collector que, de tempos em tempos, automaticamente, verifica se todos os objetos na memória estão sendo referenciados, se não possuem referências, os objetos são destruídos e a memória, que era ocupada por esses objetos sem referências, é liberada. O método finalize() especifica o que deve ser feito momentos antes do espaço do objeto ser retomado pelo garbage collector.



**Questão 3:**  Considere o seguinte cenário:

*Um veículo aéreo não-tripulado (VANT, também conhecido como **drone** é todo e qualquer tipo de aeronave que não necessita de pilotos embarcados para ser guiada. Este tipo de aviões é controlado à distância por meios eletrônicos e computacionais, sob a supervisão de humanos, ou mesmo sem a sua intervenção, por meio de Controladores Lógicos Programáveis (CLP).* Fonte: [Wikipedia](https://pt.wikipedia.org/wiki/Ve%C3%ADculo_a%C3%A9reo_n%C3%A3o_tripulado)

Drones civis vendidos atualmente possuem, em sua maior parte, as seguintes características: 

| Característica   | Valores (intervalo)         |
|:-----------------|:----------------------------|
| N. de hélices    | 4, 6 ou 8                   |
| Câmera           | SD, HD, UHD ou s-UHD        |
| Vel. vert. max.  | de 10 a 16 m/s              |
| Vel. hor. max.   | de 10 a 16 m/s              |
| Autonomia bateria| de 5 a 30 minutos de voo    |
| Distância máxima | de 50 metros a 20 kilometros|

Além dessas características, drones possuem as seguintes funções básicas: a) aumentar/diminuir velocidade vertical, b) aumentar/diminuir velocidade horizontal, c) iniciar/interromper gravação da câmera e d) diminuir velocidades máxima (horizontal e vertical) em 50% sempre que a autonomia da bateria for menor do que 5 minutos. 

Dado esse cenário, pede-se aos alunos que representem (inicialmente) as características e comportamentos de um drone através de um diagrama de classes e, posteriormente, apresente a implementação dessa classe na linguagem Java.

{% highlight java %}
package questao3;

public class Drone {
	
	String marca;
	String modelo;
	int numeroHelices;
	String camera;
	int velocidadeVertical;
	int velocidadeHorizontal;
	int autonomiaBateria;
	int distanciaMaxima;
	
	Drone() {
		
	}
	
	Drone(String marca, String modelo, int numeroHelices, String camera, int velocidadeVertical, int velocidadeHorizontal,
	      int autonomiaBateria, int distanciaMaxima) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numeroHelices = numeroHelices;
		this.camera = camera;
		this.velocidadeVertical = velocidadeVertical;
		this.velocidadeHorizontal = velocidadeHorizontal;
		this.autonomiaBateria = autonomiaBateria;
		this.distanciaMaxima = distanciaMaxima;
		
	}
	
void imprime(){
		
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Numero de helices: " + numeroHelices);
		System.out.println("Camera: " + camera);
		System.out.println("Velocidade vertical maxima: " + velocidadeVertical + " m/s");
		System.out.println("Velocidade Horizontal maxima: " + velocidadeHorizontal + " m/s");
		System.out.println("Autonomia bateria: " + autonomiaBateria + " minutos");
		System.out.println("Distancia maxima: " + distanciaMaxima + " metros\n");
		
	}
	
	int aumentaVelocidaVertical(int aceleracaoVertical) {
		
		velocidadeVertical += aceleracaoVertical;
		return velocidadeVertical;
	
	}
	
	int diminuiVelocidadeVertical(int desaceleracaoVertical) {
		
		velocidadeVertical -= desaceleracaoVertical;
		return velocidadeVertical;
	
	}
	
	int aumentaVelocidaHorizontal(int aceleracaoHorizontal) {
		
		velocidadeHorizontal += aceleracaoHorizontal;
		return velocidadeHorizontal;
		
	}
	
	int diminuiVelocidadeHorizontal(int desaceleracaoHorizontal) {
		
		velocidadeHorizontal -= desaceleracaoHorizontal;
		return velocidadeHorizontal;
		
	}
	
	int economiaBateriaVertical(int bateria) {
		
		velocidadeVertical = velocidadeVertical / 2;
		return velocidadeVertical;
		
	}
	
	int economiaBateriaHorizontal(int bateria) {
		
		velocidadeHorizontal = velocidadeHorizontal / 2;
		return velocidadeHorizontal;
		
	}
	
	void iniciarGravacao() {
		
		System.out.println("Gravando\n");
		
	}
	
	void interromperGravacao(){
		
		System.out.println("Gravação interrompida\n");
		
	}
	
}


{% endhighlight %} 


Drone.Uml


|           	Drone               |
|:----------------------------------|
|-marca: String                     |
|-modelo: String                    |
|-numeroHelices: int                |
|-camera: String                    |
|-velocidadeVertical: int           |
|-velocidadeHorizontal: int         |
|-autonomiaBateria: int             |
|-distanciamaxima: int              |
|:----------------------------------|
|+imprime(): void                   |
|+aumentaVelocidadeVertical(): int  |
|+diminuivelocidadeVertical(): int  |
|+aumentaVelocidadeHorizontal(): int|
|+diminuiVelocidadeHorizontal(): int|
|+economiaBateriaHorizontal(): int  |
|+economiaBateriaVertical(): int    |
|+iniciarGravacao(): void           |
|+interromperGravacao(): void       |
|:----------------------------------|

**Questão 4:** Considerando a classe definida e implementada na questão 5, pede-se que os seguintes objetos sejam criados a partir do programa principal: 

| Característica   | drone1         | drone2         | drone3            | drone4            |
|:-----------------|:---------------|:---------------|:------------------|:------------------|
| Marca            | Hubsan         | Hubsan         | DJI               | DJI               |
| Modelo           | X4 mini        | H501S X4 FPV   | Mavic Pro         | Spreading Wings   |
| N. de hélices    | 4              | 4              | 4                 | 8                 |
| Câmera           | SD             | HD             | UHD               | SUHD              |
| Vel. vert. max.  | 10 m/s         | 12 m/s         | 16 m/s            | 16 m/s            |
| Vel. hor. max.   | 10 m/s         | 12 m/s         | 16 m/s            | 16 m/s            |
| Autonomia bateria| 7 minutos      | 20 minutos     | 27 minutos        | 15 minutos        |
| Distância máxima | até 150 metros | até 1 kilometro| até 13 kilometros | até 13 kilometros |

Questao4.java
Drone.java
{% highlight java %}
package questao4;

public class Drone {
	
	String marca;
	String modelo;
	int numeroHelices;
	String camera;
	int velocidadeVertical;
	int velocidadeHorizontal;
	int autonomiaBateria;
	int distanciaMaxima;
	
	Drone() {
		
	}
	
	Drone(String marca, String modelo, int numeroHelices, String camera, int velocidadeVertical, int velocidadeHorizontal,
	      int autonomiaBateria, int distanciaMaxima) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numeroHelices = numeroHelices;
		this.camera = camera;
		this.velocidadeVertical = velocidadeVertical;
		this.velocidadeHorizontal = velocidadeHorizontal;
		this.autonomiaBateria = autonomiaBateria;
		this.distanciaMaxima = distanciaMaxima;
		
	}
	
	void imprime(){
		
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Numero de helices: " + numeroHelices);
		System.out.println("Camera: " + camera);
		System.out.println("Velocidade vertical maxima: " + velocidadeVertical + " m/s");
		System.out.println("Velocidade Horizontal maxima: " + velocidadeHorizontal + " m/s");
		System.out.println("Autonomia bateria: " + autonomiaBateria + " minutos");
		System.out.println("Distancia maxima: " + distanciaMaxima + " metros\n");
		
	}
	
	int aumentaVelocidaVertical(int aceleracaoVertical) {
		
		velocidadeVertical += aceleracaoVertical;
		return velocidadeVertical;
	
	}
	
	int diminuiVelocidadeVertical(int desaceleracaoVertical) {
		
		velocidadeVertical -= desaceleracaoVertical;
		return velocidadeVertical;
	
	}
	
	int aumentaVelocidaHorizontal(int aceleracaoHorizontal) {
		
		velocidadeHorizontal += aceleracaoHorizontal;
		return velocidadeHorizontal;
		
	}
	
	int diminuiVelocidadeHorizontal(int desaceleracaoHorizontal) {
		
		velocidadeHorizontal -= desaceleracaoHorizontal;
		return velocidadeHorizontal;
		
	}
	
	int economiaBateriaVertical(int bateria) {
		
		velocidadeVertical = velocidadeVertical / 2;
		return velocidadeVertical;
		
	}
	
	int economiaBateriaHorizontal(int bateria) {
		
		velocidadeHorizontal = velocidadeHorizontal / 2;
		return velocidadeHorizontal;
		
	}
	
	void iniciarGravacao() {
		
		System.out.println("Gravando\n");
		
	}
	
	void interromperGravacao(){
		
		System.out.println("Gravação interrompida\n");
		
	}	
}

{% endhighlight %}

Principal.java
{% highlight java %}
package questao4;

import questao4.Drone;

public class Principal {

	public static void main(String[] args) {
		
		Drone drone1, drone2, drone3, drone4;
		drone1 = new Drone();
		drone2 = new Drone();
		drone3 = new Drone("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000);
		drone4 = new Drone("DJI", "Sprediang Wings", 8, "SUHD", 16, 16, 15, 13000);
		
		drone1.marca = "Hubsan";
		drone1.modelo = "X4 mini";
		drone1.numeroHelices = 4;
		drone1.camera = "SD";
		drone1.velocidadeVertical = 10;
		drone1.velocidadeHorizontal = 10;
		drone1.autonomiaBateria = 7;
		drone1.distanciaMaxima = 150;
		
		
		drone2.marca = "Hubsan";
		drone2.modelo = "H501S X4 FPV";
		drone2.numeroHelices = 4;
		drone2.camera = "HD";
		drone2.velocidadeVertical = 12;
		drone2.velocidadeHorizontal = 12;
		drone2.autonomiaBateria = 20;
		drone2.distanciaMaxima = 1000;
		
		System.out.println("Drone 1");
		drone1.imprime();
		System.out.println("Drone 2");
		drone2.imprime();
		System.out.println("Drone 3");
		drone3.imprime();
		System.out.println("Drone 4");
		drone4.imprime();
		
	}
}
{% endhighlight %}


**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.

Drone.java
{% highlight java %}
package questao5;

public class Drone {
	
	String marca;
	String modelo;
	int numeroHelices;
	String camera;
	int velocidadeVertical;
	int velocidadeHorizontal;
	int autonomiaBateria;
	int distanciaMaxima;
	
	Drone() {
		
	}
	
	Drone(String marca, String modelo, int numeroHelices, String camera, int velocidadeVertical, int velocidadeHorizontal,
	      int autonomiaBateria, int distanciaMaxima) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numeroHelices = numeroHelices;
		this.camera = camera;
		this.velocidadeVertical = velocidadeVertical;
		this.velocidadeHorizontal = velocidadeHorizontal;
		this.autonomiaBateria = autonomiaBateria;
		this.distanciaMaxima = distanciaMaxima;
		
	}
	
	void imprime(){
		
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Numero de helices: " + numeroHelices);
		System.out.println("Camera: " + camera);
		System.out.println("Velocidade vertical maxima: " + velocidadeVertical + " m/s");
		System.out.println("Velocidade Horizontal maxima: " + velocidadeHorizontal + " m/s");
		System.out.println("Autonomia bateria: " + autonomiaBateria + " minutos");
		System.out.println("Distancia maxima: " + distanciaMaxima + " metros\n");
		
	}
	
	int aumentaVelocidadeVertical() {
		
		velocidadeVertical += 1;
		return velocidadeVertical;
	
	}
	
	int diminuiVelocidadeVertical() {
		
		velocidadeVertical -= 1;
		return velocidadeVertical;
	
	}
	
	int aumentaVelocidadeHorizontal() {
		
		velocidadeHorizontal += 1;
		return velocidadeHorizontal;
		
	}
	
	int diminuiVelocidadeHorizontal() {
		
		velocidadeHorizontal -= 1;
		return velocidadeHorizontal;
		
	}
	
	int economiaBateriaVertical(int bateria) {
		
		velocidadeVertical = velocidadeVertical / 2;
		return velocidadeVertical;
		
	}
	
	int economiaBateriaHorizontal(int bateria) {
		
		velocidadeHorizontal = velocidadeHorizontal / 2;
		return velocidadeHorizontal;
		
	}
	
	void iniciarGravacao() {
		
		System.out.println("Gravando\n");
		
	}
	
	void interromperGravacao(){
		
		System.out.println("Gravação interrompida\n");
		
	}
	
	/*void statusGravacao() {
		if(drone == iniciarGravacao()){
			System.out.println("Gravando");
		}else
			System.out.println("Nao gravando");
		
	}*/
	
}
{% endhighlight %}

ControleRemoto.java
{% highlight java %}
package questao5;


public class ControleRemoto {
	
	int autonomiaBateria;
	int alcance;
	Drone drone;
	
	public ControleRemoto() {
	}
	
	public ControleRemoto(int autonomiaBateria, int alcance, Drone drone){
		
		this.autonomiaBateria = autonomiaBateria;
		this.alcance = alcance;
		this.drone = drone;
		
	}
	
	int aumentaVelocidadeVertical() {
	
		return drone.aumentaVelocidadeHorizontal();
	
	}
	
	int diminuiVelocidadeVertical() {
		
		return drone.diminuiVelocidadeVertical();
	
	}
	
	int aumentaVelocidadeHorizontal() {
		
		return drone.aumentaVelocidadeHorizontal();
		
	}
	
	int diminuiVelocidadeHorizontal() {
		
		return drone.diminuiVelocidadeHorizontal();
		
	}
	
	void iniciarGravacao() {
		
		drone.iniciarGravacao();
		
	}
	
	void interromperGravacao(){
		
		drone.interromperGravacao();
		
	}

}


{% endhighlight %}

Principal.java
{% highlight java %}
package questao5;

import questao5.Drone;

public class Principal {

	public static void main(String[] args) {
		
		Drone drone1, drone2, drone3, drone4;
		ControleRemoto controle1, controle2, controle3, controle4;
		
		drone1 = new Drone();
		drone2 = new Drone();
		drone3 = new Drone("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000);
		drone4 = new Drone("DJI", "Sprediang Wings", 8, "SUHD", 16, 16, 15, 13000);
		
		drone1.marca = "Hubsan";
		drone1.modelo = "X4 mini";
		drone1.numeroHelices = 4;
		drone1.camera = "SD";
		drone1.velocidadeVertical = 10;
		drone1.velocidadeHorizontal = 10;
		drone1.autonomiaBateria = 7;
		drone1.distanciaMaxima = 150;
		
		
		drone2.marca = "Hubsan";
		drone2.modelo = "H501S X4 FPV";
		drone2.numeroHelices = 4;
		drone2.camera = "HD";
		drone2.velocidadeVertical = 12;
		drone2.velocidadeHorizontal = 12;
		drone2.autonomiaBateria = 20;
		drone2.distanciaMaxima = 1000;
		
		controle1 = new ControleRemoto();
		controle2 = new ControleRemoto();
		controle3 = new ControleRemoto(80, 10000, drone3);
		controle4 = new ControleRemoto(90, 20000, drone4);
		
		controle1.autonomiaBateria = 60;
		controle1.alcance = 1000;
		controle1.drone = drone1;
		
		controle2.autonomiaBateria = 70;
		controle2.alcance = 10000;
		controle2.drone = drone2;
		
		System.out.println("Drone 1");
		drone1.imprime();
		System.out.println("Drone 2");
		drone2.imprime();
		System.out.println("Drone 3");
		drone3.imprime();
		System.out.println("Drone 4");
		drone4.imprime();
		
	}

}



{% endhighlight %}






**Questão 6:** Sejam os seguintes códigos da *ClasseA* e da aplicação principal escritas em JAVA. 

Questao6.java
{% highlight java %}
public class Questao6 {
  int   a1; 
  float   a2; 
  String  a3;
  boolean a4;
  
  public Questao6() {}
  
  public Questao6(int a, float b, String c, boolean d){
    a1 = a;
    a2 = b;
    a3 = c;
    a4 = d;
  }
}
{% endhighlight%}

Principal.java
{% highlight java%}
public class Principal {
  public static void main (String[] args) {
    Questao6 q1, 
             q2,
             q3;
    
    q1 = new Questao6();
    q2 = new Questao6(0, 0.0f, null, false);
    q3 = new Questao6(1, 1.0f, "null", false);
    
    //---> local onde a instrução do item c) será inserida.
  }
}
{% endhighlight %}
Responda as seguintes questões com base nos códigos acima: 

a) As referências a1 e a2 para objetos de *ClasseA* são iguais?

	As referências a1 e a2 são diferentes, pois duas ou mais referências podem ser provenientes da mesma classe e instanciar objetos da mesma classe, mas seus endereços são diferentes.

b) Qual o estado de cada dos objetos de cada referência? 

	Objeto q1:
	    	a1 = 0
	    	a2 = 0.0
	    	a3 = null
		a4 = false

	Objeto q2:
		a1 = 0
		a2 = 0.0
		a3 = null
		a4 = false

	Objeto q3:
		a1 = 1
		a2 = 1.0
		a3 = null (uma String escrita “null”)
		a4 = false


c) O que será impresso pela função *main* da classe *Principal* se a linha número *11* for igual a: 
{% highlight java%}
System.out.println(q1 == q2);
System.out.println(q1.a1 == q2.a1);
System.out.println(q2.a3 == q3.a3);
System.out.println(q1.a2 == q2.a2);
System.out.println(q1.a4 == q3.a4);
System.out.println(q3 == q2);
{% endhighlight %}

    False
    True
    False
    True
    True
    False



**Questão 7:**

O programa irá imprimir os “obterDetalhes()” de a1,
Nome: Andre
Curso: c1
Data de nascimento: 23/02/1983

“obterDetalhes()” de a2,
Nome: Maria
Curso: c2
Data de nascimento:27/5/1994

“obterDetalhes()” de a3,
Nome: Junior
Curso: c1
Data de nascimento: 16/11/1995

False
False
True


**Questão 8:**

Os seguintes objetos foram finalizados:

Objeto referenciado inicialmente por “c2”
Nome do curso: Engenharia Eletrônica
Código: 2
carga Horaria: 257

Objeto referenciado inicialmente por “a2”
Nome: Maria
Curso: c2
matricula: 27
data de nascimento: 27/05/1994

Objeto referenciado inicialmente por “a3”
Nome: Junior
Curso: c1
Matricula: 70
data de nascimento:16/11/1995

Restando os seguintes objetos:

Objeto referenciado inicialmente por “a1”
Nome: Andre
Curso: c1
Matricula: 13
data de nascimento:23/02/1983

Objeto referenciado inicialmente por “c1”
Nome do curso: Engenharia de Software
Código: 1
carga Horaria: 240


**Questão 9:**

{% highlight java%}
package questao9;
public class Principal {
    public static void main(String[] args) {
        Curso c1, c2;
        Aluno a1, a2, a3;
        
        c2 = new Curso(2, "Engenharia Eletrônica", 257);
        
        a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
        a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
        
        Curso.obterDetalhes(); ERRO //esta chamando a função da classe e nao do objeto intanciado
        c2.matricula = 20; ERRO // matricula eh um atributo de Aluno
        Curso.nome = "Ciência da computação"; ERRO //esta chamando a função da classe e nao do objeto intanciado
        c1.codigo = 21;
        Aluno.obterDetalhes(); ERRO //esta chamando a função da classe e nao do objeto intanciado
        a3.cargaHoraria() = 220; ERRO // cargaHoraria eh um atributo de Curso
    }
}
{% endhighlight %}

{% highlight java%}
exemplo de solucao:

c1.obterDetalhes();
    a1.matricula = 20; 
    c1.nome = "Ciência da computação";
    c1.codigo = 21;
    c2.obterDetalhes();
    c1.cargaHoraria() = 220;
{% endhighlight %}



**Questão 10:**
a)

Turma.java
{% highlight java%}
package questao10;

public class Turma {
	
	int codigoTurma;
	int totalVagas;
	int vagasLivre;
	int vagasOcupadas;
	String gradeHoraria;
	
	void matricula(){
		
		if(vagasLivre >= 1 ){
			System.out.println("Pode matricular");
			vagasLivre -= 1;
			System.out.println("Numero de vagas disponiveis: " + vagasLivre);
		}else{
			System.out.println("Turma lotada");
		}
	}

}
{% endhighlight %}

B)

Principal.java
{% highlight java%}
package questao10;

public class Principal {

	public static void main(String[] args) {
		Turma oo, das;
		
		oo = new Turma();
		das = new Turma();
		
		oo.vagasLivre = 46;
		oo.gradeHoraria = "4as e 6as feiras, das 12:00 às 16:00 horas";
		
		das.vagasLivre = 30;
		das.gradeHoraria = "4as. e 6as. feiras, das 16:00 às 18:00 horas";
		
		System.out.println("Orientação a Objetos: ");
		System.out.println("Vagas livres: " + oo.vagasLivre);
		System.out.println("Grade Horaria: " + oo.gradeHoraria);
		
		System.out.println("Desenvolvimento Avançado de Software: ");
		System.out.println("Vagas livres: " + das.vagasLivre);
		System.out.println("Grade Horaria: " + das.gradeHoraria);

	}

}
{% endhighlight %}

C)
Principal.java
{% highlight java%}
package questao10;

public class Principal {

	public static void main(String[] args) {
		Turma oo, das;
		
		oo = new Turma();
		das = new Turma();
		
		oo.vagasLivre = 46;
		oo.gradeHoraria = "4as e 6as feiras, das 12:00 às 16:00 horas";
		
		das.vagasLivre = 30;
		das.gradeHoraria = "4as. e 6as. feiras, das 16:00 às 18:00 horas";
		
		System.out.println("Orientação a Objetos: ");
		System.out.println("Vagas livres: " + oo.vagasLivre);
		System.out.println("Grade Horaria: " + oo.gradeHoraria);
		
		System.out.println("Desenvolvimento Avançado de Software: ");
		System.out.println("Vagas livres: " + das.vagasLivre);
		System.out.println("Grade Horaria: " + das.gradeHoraria);
		
		Curso curso;
		curso = new Curso(0 ,"Engenharia de Software",0 );
		

	}

}

{% endhighlight %}





## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*





[eckDavid]: http://math.hws.edu/javanotes/
