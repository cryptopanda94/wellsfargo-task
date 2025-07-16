package com.wellsfargo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Advisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorID;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public Advisor() {}

    public Advisor(String firstName, String lastName, String email, String phone, List<Client> clients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.clients = clients;
    }

    public Long getAdvisorID() { return advisorID; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
