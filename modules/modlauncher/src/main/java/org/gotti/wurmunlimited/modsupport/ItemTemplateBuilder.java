package org.gotti.wurmunlimited.modsupport;

import java.io.IOException;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTemplateFactory;

public class ItemTemplateBuilder {

	private int templateId;
	private String name;
	private String plural;
	private int size = 3;
	private String itemDescriptionSuperb = "superb"; 
	private String itemDescriptionNormal = "good";
	private String itemDescriptionBad = "ok";
	private String itemDescriptionRotten = "poor";
	private String itemDescriptionLong;
	private short[] itemTypes;
	private short imageNumber;
	private short behaviourType;
	private int combatDamage = 0;
	private long decayTime = 9072000L;
	private int centimetersX;
	private int centimetersY;
	private int centimetersZ;
	private int primarySkill = -10;
	private byte[] bodySpaces = MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY;
	private String modelName;
	private float difficulty;
	private int weightGrams;
	private byte material;
	private int value = 0;
	private boolean isTraded = false;
	private int armourType = -1;

	public ItemTemplateBuilder(String identifier) {
		this.templateId = IdFactory.getIdFor(identifier, IdType.ITEMTEMPLATE);
	}

	public ItemTemplateBuilder name(String name, String plural, String description) {
		this.name = name;
		this.plural = plural;
		this.itemDescriptionLong = description;
		return this;
	}
	
	public ItemTemplateBuilder size(int size) {
		this.size = size;
		return this;
	}

	public ItemTemplateBuilder descriptions(String itemDescriptionSuperb, String itemDescriptionNormal, String itemDescriptionBad, String itemDescriptionRotten) {
		this.itemDescriptionSuperb = itemDescriptionSuperb;
		this.itemDescriptionNormal = itemDescriptionNormal;
		this.itemDescriptionBad = itemDescriptionBad;
		this.itemDescriptionRotten = itemDescriptionRotten;
		return this;
	}

	public ItemTemplateBuilder itemTypes(short[] itemTypes) {
		this.itemTypes = itemTypes;
		return this;
	}

	public ItemTemplateBuilder weightGrams(int weightGrams) {
		this.weightGrams = weightGrams;
		return this;
	}

	public ItemTemplateBuilder material(byte material2) {
		this.material = material2;
		return this;
	}

	public ItemTemplateBuilder value(int value2) {
		this.value = value2;
		return this;
	}

	public ItemTemplateBuilder isTraded(boolean isTraded2) {
		this.isTraded = isTraded2;
		return this;
	}

	public ItemTemplateBuilder armourType(int armourType2) {
		this.armourType = armourType2;
		return this;
	}
	
	public ItemTemplateBuilder difficulty(float difficulty2) {
		this.difficulty = difficulty2;
		return this;
	}

	public ItemTemplateBuilder modelName(String modelName2) {
		this.modelName = modelName2;
		return this;
	}

	public ItemTemplateBuilder bodySpaces(byte[] bodySpaces2) {
		this.bodySpaces = bodySpaces2;
		return this;
	}

	public ItemTemplateBuilder primarySkill(int primarySkill2) {
		this.primarySkill = primarySkill2;
		return this;
	}

	public ItemTemplateBuilder dimensions(int centimetersX2, int centimetersY2, int centimetersZ2) {
		this.centimetersX = centimetersX2;
		this.centimetersY = centimetersY2;
		this.centimetersZ = centimetersZ2;
		return this;
	}

	public ItemTemplateBuilder decayTime(long decayTime2) {
		this.decayTime = decayTime2;
		return this;
	}

	public ItemTemplateBuilder combatDamage(int combatDamage2) {
		this.combatDamage = combatDamage2;
		return this;
	}

	public ItemTemplateBuilder behaviourType(short behaviourType2) {
		this.behaviourType = behaviourType2;
		return this;
	}

	public ItemTemplateBuilder imageNumber(short imageNumber) {
		this.imageNumber = imageNumber;
		return this;
	}

	public ItemTemplate build(final String name, int size, final String plural, final String itemDescriptionSuperb, final String itemDescriptionNormal, final String itemDescriptionBad, final String itemDescriptionRotten, final String itemDescriptionLong, final short[] itemTypes, final short imageNumber,
			final short behaviourType, final int combatDamage, final long decayTime, final int centimetersX, final int centimetersY, final int centimetersZ, final int primarySkill, final byte[] bodySpaces, final String modelName, final float difficulty, final int weightGrams, final byte material, int value, boolean isTraded, int armourType)
			throws IOException {

		this.name(name, plural, itemDescriptionLong);
		this.size(3);
		this.descriptions(itemDescriptionSuperb, itemDescriptionNormal, itemDescriptionBad, itemDescriptionRotten);
		this.itemTypes(itemTypes);
		this.imageNumber(imageNumber);
		this.behaviourType(behaviourType);
		this.combatDamage(combatDamage);
		this.decayTime(decayTime);
		this.dimensions(centimetersX, centimetersY, centimetersZ);
		this.primarySkill(primarySkill);
		this.bodySpaces(bodySpaces);
		this.modelName(modelName);
		this.difficulty(difficulty);
		this.weightGrams(weightGrams);
		this.material(material);
		this.value(value);
		this.isTraded(isTraded);
		this.armourType(armourType);

		return build();

	}

	public ItemTemplate build() throws IOException {
		return ItemTemplateFactory.getInstance().createItemTemplate(templateId, size, name, plural, itemDescriptionSuperb, itemDescriptionNormal, itemDescriptionBad, itemDescriptionRotten, itemDescriptionLong, itemTypes, imageNumber, behaviourType, combatDamage, decayTime, centimetersX,
				centimetersY, centimetersZ, primarySkill, bodySpaces, modelName, difficulty, weightGrams, material, value, isTraded, armourType);

	}

}
