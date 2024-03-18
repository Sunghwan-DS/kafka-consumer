package jsh.kafkaconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.common.TopicPartition;

import java.util.Collection;

@Slf4j
public class RebalanceListener implements ConsumerRebalanceListener {

    @Override
    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
        log.warn("Partitions are revoked : {}", partitions.toString());
    }

    @Override
    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
        log.warn("Partitions are assigned : {}", partitions.toString());
    }
}
