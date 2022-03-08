package br.com.avf.hexagonal.usuario.domains;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
public class Address {

    private String zipCode;
    private String route;
    private String city;
    private String uf;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
