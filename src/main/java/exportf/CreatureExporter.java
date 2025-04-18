package exportf;

import importf.CreatureImporter;
import objects.Creature;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class CreatureExporter {
    protected CreatureExporter next;

    public void setNext(CreatureExporter next) {
        this.next = next;
    }

    public abstract boolean exportCreatures(Map<String, List<Creature>> creatures);

    public boolean hasNext() {
        return next != null;
    }
}