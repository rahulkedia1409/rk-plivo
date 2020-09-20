package com.plivo.pojo.response;

import java.util.List;

public class PricingMessagee {
    public Inbound inbound;
    public Outbound outbound;
    public List<NetworkList> outbound_networks_list;

    public Inbound getInbound() {
        return inbound;
    }

    public void setInbound(Inbound inbound) {
        this.inbound = inbound;
    }

    public Outbound getOutbound() {
        return outbound;
    }

    public void setOutbound(Outbound outbound) {
        this.outbound = outbound;
    }

    public List<NetworkList> getOutbound_networks_list() {
        return outbound_networks_list;
    }

    public void setOutbound_networks_list(List<NetworkList> outbound_networks_list) {
        this.outbound_networks_list = outbound_networks_list;
    }

    @Override
    public String toString() {
        return "PricingMessagee{" +
                "inbound=" + inbound +
                ", outbound=" + outbound +
                ", outbound_networks_list=" + outbound_networks_list +
                '}';
    }
}
