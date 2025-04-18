package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Creature {
    private String name;
    private String description;
    private int dangerLevel;
    private ArrayList<String> areas;
    private String firstMention;
    private Map<String, Boolean> vulnerabilities = new HashMap<>();
    private double height;
    private int weight;
    private String activityTime;
    private Recipe recipe;
    private String source;

    public Creature(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public Creature(String name, String description, int dangerLevel, ArrayList<String> areas,
                    String firstMention, Double height, int weight,
                    String activityTime, Recipe recipe, String source) {
        this.name = name;
        this.description = description;
        this.dangerLevel = dangerLevel;
        this.areas = areas;
        this.firstMention = firstMention;
        this.height = height;
        this.weight = weight;
        this.activityTime = activityTime;
        this.recipe = recipe;
        this.source = source;
    }

    public void print() {
        System.out.println(this.name + " " + this.description + " " + this.dangerLevel + " " + this.areas + " " + this.firstMention + " " + this.height + " " + this.weight + " " + this.activityTime + " " + this.source);
    }

    public void addVulnerability(String type, boolean isVulnerable) {
        vulnerabilities.put(type, isVulnerable);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public ArrayList<String> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<String> areas) {
        this.areas = areas;
    }

    public String getFirstMention() {
        return firstMention;
    }

    public void setFirstMention(String firstMention) {
        this.firstMention = firstMention;
    }

    public Map<String, Boolean> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(Map<String, Boolean> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}