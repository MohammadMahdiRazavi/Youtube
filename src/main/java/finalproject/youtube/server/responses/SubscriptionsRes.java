package finalproject.youtube.server.responses;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

public class SubscriptionsRes implements Serializable {
    private int SQLResponse;
    private ArrayList<ChannelRes> channels;
    public SubscriptionsRes(){
        channels = new ArrayList<>();
    }
    public void addChannel(ChannelRes channel){
        channels.add(channel);
    }

    public ArrayList<ChannelRes> getChannels() {
        return channels;
    }

    public int getSQLResponse() {
        return SQLResponse;
    }
    public void setSQLResponse(int SQLResponse) {
        this.SQLResponse = SQLResponse;
    }

}
