package importf;

import objects.Creature;

import java.io.File;
import java.util.List;

public abstract class CreatureImporter {
    protected CreatureImporter next;

    public void setNext(CreatureImporter next) {
        this.next = next;
    }

    public abstract List<Creature> importCreatures(File file);
}
