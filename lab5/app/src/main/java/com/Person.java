package com;

import com.attributes.XmlObject;
import com.attributes.XmlTag;

@XmlObject
class Wtf {
  @XmlTag(name = "wtf-field")
  private final int suv = 3333333;
}

@XmlObject
public class Person {

  // @XmlTag(name = "fullname")
  // private final String name;

  // @XmlAttribute(tag = "fullname")
  // private final String lang;
  @XmlTag()
  private final int foo = 30;
  @XmlTag(name = "wtf")
  private final Wtf rb = new Wtf();

  // public Person(String name, String lang, int age) {
  // this.name = name;
  // this.lang = lang;
  // this.age = age;
  // }

  // public String getName() {
  // return name;
  // }

  // public int getAge() {
  // return 1;
  // }

  // @XmlTag
  // public String getName() {
  // return "si";
  // }

  // @XmlTag
  // public String asdasd() {
  // return "123213";
  // }

  // @XmlTag
  // public void lalla() {
  // }
}