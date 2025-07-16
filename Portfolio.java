package com.wellsfargo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    private String name;
    private String createdDate;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(String name, String createdDate, Client client, List<Security> securities) {
        this.name = name;
        this.createdDate = createdDate;
        this.client = client;
        this.securities = securities;
    }

    public Long getPortfolioID() { return portfolioID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public List<Security> getSecurities() { return securities; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}
