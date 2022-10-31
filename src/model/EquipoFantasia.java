package model;

import java.util.ArrayList;

public class EquipoFantasia extends Equipo{

    JugadorFantasiaArquero arqueroTitular, arqueroSustituto;
    ArrayList<JugadorFantasiaDefensivo> defensasTitulares = new ArrayList<>();
    ArrayList<JugadorFantasia> delanterosTitulares, mediosTitulares = new ArrayList<>();
    JugadorFantasiaDefensivo defensaSustituto;
    JugadorFantasia delanteroSustituto, medioSustituto;
    ArrayList<JugadorFantasia> jugadores = new ArrayList<>();
    
    public EquipoFantasia(String pNombreEquipo){
        super(pNombreEquipo);
    }

    @Override
    public String getNombreEquipo() {
        return super.getNombreEquipo();
    }
    /**
     * Retorna al arquero titular
     * @return
     */
    public JugadorFantasiaArquero getArqueroTitular() {
        return arqueroTitular;
    }
    /**
     * Retorna al arquero sustituto
     * @return
     */
    public JugadorFantasiaArquero getArqueroSustituto() {
        return arqueroSustituto;
    }
    /**
     * Retorna al defensa sustituto
     * @return
     */
    public JugadorFantasiaDefensivo getDefensaSustituto() {
        return defensaSustituto;
    }
    /**
     * Retorna al delantero sustituto
     * @return
     */
    public JugadorFantasia getDelanteroSustituto() {
        return delanteroSustituto;
    }
    /**
     * Retorna al medio campista sustituto
     * @return
     */
    public JugadorFantasia getMedioSustituto() {
        return medioSustituto;
    }
    /**
     * Retorna la lista de los defensas titutlares
     * @return
     */
    public ArrayList<JugadorFantasiaDefensivo> getDefensasTitutlares() {
        return defensasTitulares;
    }
    /**
     * Retorna la lista de los delanteros titulares
     * @return
     */
    public ArrayList<JugadorFantasia> getDelanterosTitutlares() {
        return delanterosTitulares;
    }
    /**
     * Retorna la lista de los medio campistas titutlares
     * @return
     */
    public ArrayList<JugadorFantasia> getMediosTitulares() {
        return mediosTitulares;
    }
    /**
     * Agrega un delantero a los delanteros titulares
     * @param pDelantero
     */
    public void agregarDelanteroTitular(JugadorFantasia pDelantero){
        this.delanterosTitulares.add(pDelantero);
    }
    /**
     * Agrega un medio campista a los medio campistas titulares
     * @param pMedio
     */
    public void agregarMedioTitular(JugadorFantasia pMedio){
        this.mediosTitulares.add(pMedio);
    }
    /**
     * Agrega un defensa a los defensas titulares
     * @param pDefensa
     */
    public void agregarDefensaTitular(JugadorFantasiaDefensivo pDefensa){
        this.defensasTitulares.add(pDefensa);
    }
    /**
     * Asigna un arquero como titular
     * @param pArqueroTitular
     */
    public void setArqueroTitular(JugadorFantasiaArquero pArqueroTitular) {
        this.arqueroTitular = pArqueroTitular;
    }
    /**
     * Asigna un arquero como sustituto
     * @param pArqueroSustituto
     */
    public void setArqueroSustituto(JugadorFantasiaArquero pArqueroSustituto) {
        this.arqueroSustituto = pArqueroSustituto;
    }
    /**
     * Asigna un defensa como sustituto
     * @param pDefensaSustituto
     */
    public void setDefensaSustituto(JugadorFantasiaDefensivo pDefensaSustituto) {
        this.defensaSustituto = pDefensaSustituto;
    }
    /**
     * Asigna un medio campista como sustituto
     * @param pMedioSustituto
     */
    public void setMedioSustituto(JugadorFantasia pMedioSustituto) {
        this.medioSustituto = pMedioSustituto;
    }
    /**
     * Asigna un delantero como sustituto
     * @param pDelanteroSustituto
     */
    public void setDelanteroSustituto(JugadorFantasia pDelanteroSustituto) {
        this.delanteroSustituto = pDelanteroSustituto;
    }

    public boolean verificarDisponibilidad(JugadorFantasia pJugador){
        if(jugadores.contains(pJugador)){
            return false;
        }
        else{
            return true;
        }
    }
    

}