package space.cougs.ground.packetprocessing.uplinkpackets;

import java.io.File;

public abstract class UplinkPacket {
  private static final int MAX_PACKET_LENGTH = 1024;

  private boolean dataLoaded = false;

  public abstract File encodePacket();

  boolean isDataLoaded() {
    return dataLoaded;
  }

  final void setDataLoaded(boolean value) {
    dataLoaded = value;
  }

  final int getMaxPacketLength() {
    return MAX_PACKET_LENGTH;
  }
}
