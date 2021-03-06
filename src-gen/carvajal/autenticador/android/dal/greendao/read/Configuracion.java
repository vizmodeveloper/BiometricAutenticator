package carvajal.autenticador.android.dal.greendao.read;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CONFIGURACION.
 */
public class Configuracion {

    private Long id;
    /** Not-null value. */
    private String CodProv;
    /** Not-null value. */
    private String CodMpio;
    /** Not-null value. */
    private String CodZona;
    /** Not-null value. */
    private String CodColElec;
    /** Not-null value. */
    private String CodMesa;
    /** Not-null value. */
    private String NombreBD;
    private int ConfActiva;
    /** Not-null value. */
    private String IPServidor;

    public Configuracion() {
    }

    public Configuracion(Long id) {
        this.id = id;
    }

    public Configuracion(Long id, String CodProv, String CodMpio, String CodZona, String CodColElec, String CodMesa, String NombreBD, int ConfActiva, String IPServidor) {
        this.id = id;
        this.CodProv = CodProv;
        this.CodMpio = CodMpio;
        this.CodZona = CodZona;
        this.CodColElec = CodColElec;
        this.CodMesa = CodMesa;
        this.NombreBD = NombreBD;
        this.ConfActiva = ConfActiva;
        this.IPServidor = IPServidor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getCodProv() {
        return CodProv;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCodProv(String CodProv) {
        this.CodProv = CodProv;
    }

    /** Not-null value. */
    public String getCodMpio() {
        return CodMpio;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCodMpio(String CodMpio) {
        this.CodMpio = CodMpio;
    }

    /** Not-null value. */
    public String getCodZona() {
        return CodZona;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCodZona(String CodZona) {
        this.CodZona = CodZona;
    }

    /** Not-null value. */
    public String getCodColElec() {
        return CodColElec;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCodColElec(String CodColElec) {
        this.CodColElec = CodColElec;
    }

    /** Not-null value. */
    public String getCodMesa() {
        return CodMesa;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCodMesa(String CodMesa) {
        this.CodMesa = CodMesa;
    }

    /** Not-null value. */
    public String getNombreBD() {
        return NombreBD;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setNombreBD(String NombreBD) {
        this.NombreBD = NombreBD;
    }

    public int getConfActiva() {
        return ConfActiva;
    }

    public void setConfActiva(int ConfActiva) {
        this.ConfActiva = ConfActiva;
    }

    /** Not-null value. */
    public String getIPServidor() {
        return IPServidor;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setIPServidor(String IPServidor) {
        this.IPServidor = IPServidor;
    }

}
