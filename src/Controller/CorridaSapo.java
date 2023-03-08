package Controller;

public class CorridaSapo extends Thread  {
	private String nome; // nome do sapo
	 private int distanciaperco=0;//distancia que ele percorre
	 private int distanciaTot; // distancia total
	private int pulo=0; //pulos que ele vai dar
	private int qtdpulo=0; // quantidades de pulos que ele vai dar
	private static int colocacao=0; // a colocacao
	private final static int pulo_maximo=25;
	
	public CorridaSapo(String nome, int distanciaTot) {
		super(nome);
		this.nome=nome;
		this.distanciaTot=distanciaTot;
	}
	
	
	
	public void corridamaluca() {
		System.out.println(" O "+ nome + " Pulou "+ pulo +" cm/t e percorreu " + distanciaperco +" cm ");
	}
	
	
	public void Sapopula() {
		qtdpulo++;
		pulo=(int) (Math.random()*pulo_maximo);
		distanciaperco=distanciaperco+pulo;
		if(distanciaperco> distanciaTot) {
			distanciaperco=distanciaTot;
			
		}	
	}
	
	
	public void sapopara() {
		yield();
	
	}
	
	
	public void ranking() {
		colocacao++;
		System.out.println("\n"+ nome + "foi o "+ colocacao+" colocando com "+ qtdpulo+ "pulos" );
	}
	
	
	
	
	@Override
	public void run() {
		while(distanciaperco<distanciaTot) {
		Sapopula();
		corridamaluca();
		sapopara();
		
		try {
			sleep(200);
			
		}catch (InterruptedException e) {}
		}
			// TODO: handle exception
		
			try {
			sleep(2000);
			}catch(InterruptedException e) {}
			
		ranking();
		
	}
}
