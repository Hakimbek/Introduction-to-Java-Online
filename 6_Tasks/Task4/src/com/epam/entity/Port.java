package com.epam.entity;

import java.util.UUID;

public class Port {
    // id
    private UUID uuid;

    // name of port
    private String name;

    // containers in port
    private Integer containersInPort;

    // port capacity
    private Integer portCapacity;

    // container
    public Port(String name, Integer containersInPort, Integer portCapacity) {
        this.name = name;
        this.containersInPort = containersInPort;
        this.portCapacity = portCapacity;
    }

    @Override
    public String toString() {
        return "Port{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", containersInPort=" + containersInPort +
                ", portCapacity=" + portCapacity +
                '}';
    }

    // get- and set-
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContainersInPort() {
        return containersInPort;
    }

    public void setContainersInPort(Integer containersInPort) {
        this.containersInPort = containersInPort;
    }

    public Integer getPortCapacity() {
        return portCapacity;
    }

    public void setPortCapacity(Integer portCapacity) {
        this.portCapacity = portCapacity;
    }
}
