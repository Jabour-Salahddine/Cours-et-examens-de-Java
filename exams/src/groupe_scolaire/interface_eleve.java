
package java101.groupe_scolaire;


public interface interface_eleve {
        
    void create(eleve e);
    void delete(eleve e);
    eleve findByCode(String Code);
}
