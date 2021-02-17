package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExperimentalPlane)) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) o;
        return experimentalTypes == experimentalPlane.experimentalTypes && classificationLevel == experimentalPlane.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),experimentalTypes,classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}"," ExperimentalPlane='" + experimentalTypes +
                "classificationLevel='" + classificationLevel +
                '}');
    }
}
