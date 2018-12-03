package pokemon;

import java.util.ArrayList;

/**
 *Classe pokemon contem todos atributos vida,mana,tipo
 * @author joao
 */
public class Pokemon {
	
    /**
     *Nome do pokemon
     */
    protected String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }

    /**
     *string do tipo do pokemon 
     */
    protected String nomeTipo;
    
    public String getNomeTipo(){
        return nomeTipo;
    }
    
    public void setNomeTipo(String nomeTipo){
        this.nomeTipo=nomeTipo;
    }
    

    /**
     * tipo do pokemon : Agua,Eletrico...etc
     */
    protected int tipo; 
    
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(int tipo){
        this.tipo=tipo;
    }

    /**
     *  vetor das habilidades de ataque do pokemon 
     */
    protected String[] habilidades = new String[3];
    
    public String[] getHabilidades(){
        return habilidades;
    }
    

    /**
     *Multiplicador das habiliades de acordo com seu dano
     */
    protected float[] multiHabilidades = {2,1.5f,1,0};

    /**
     *custa de uso de cada habilidade
     */
    protected int[] manaPoints = {75,50,25,0};

    /**
     *vida do pokemon
     */
    protected float healthPoints;
    
    public float getHealthPoints(){
        return healthPoints;
    }
    
    public void setHealthPoints(float healthPoints){
        this.healthPoints=healthPoints;
    }

    /**
     *dano apos verificar vantagens e desvantagens
     */
    protected float danoAtual = 10;

    /**
     *dano do pokemon
     */
    protected float dano;
    
    /**
     *dano inicial do pokemon
     */
    protected float danoInicial=10;
  
       
        // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico

    /**
     *vetor de vantanges contra outros tipos
     */
       public ArrayList<Integer> vantagens = new ArrayList<Integer>(); 

   
        
    /**
     *
     * @param index
     * @return
     */
    public float calculaAtaque(int index){
            dano = danoAtual;
            dano = dano * multiHabilidades[index];
            return dano;
        }
    
    public float getDanoAtual(){
        return danoAtual;
    }
    
    public void setDanoAtual(float danoAtual){
       this.danoAtual = danoAtual;
    }
    
    public float getDanoInicial(){
        return danoInicial;
    }
    

}
