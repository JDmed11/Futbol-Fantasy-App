package controller;

import model.*;

public class CreadorObjetos {

    public CreadorObjetos(){
    }

    /**
     * Crea un nuevo participante
     * @param pNombreUsuario
     * @param pClave
     * @return
     */
    public Participante crearParticipante(String pNombreUsuario, String pClave){
        Participante nuevoParticipante = new Participante(pNombreUsuario, pClave);
        Persistencia.guardarParticipante(nuevoParticipante);
        return nuevoParticipante;
    }

    /**
     * crea una temporada real
     * @return
     */
    public TemporadaReal crearTemporadaReal(){
        TemporadaReal nuevaTemporadaReal = new TemporadaReal();
        return nuevaTemporadaReal;
    }

    /**
     * Crea un equipo real
     * @param pNombreEquipo
     * @return
     */
    public EquipoReal crearEquipoReal(String pNombreEquipo){
        EquipoReal nuevoEquipoReal = new EquipoReal(pNombreEquipo);
        return nuevoEquipoReal;
    }

    /**
     * Crea un jugador real
     * @param pNombre
     * @param pPosicion
     * @param pPrecioCompra
     * @param pEquipoJugador
     * @return
     */
    public JugadorReal crearJugadorReal(String pNombre, String pPosicion, double pPrecioCompra, Equipo pEquipoJugador){
        JugadorReal nuevoJugadorReal = new JugadorReal(pNombre, pPosicion, pPrecioCompra, pEquipoJugador);
        return nuevoJugadorReal;
    }
}
