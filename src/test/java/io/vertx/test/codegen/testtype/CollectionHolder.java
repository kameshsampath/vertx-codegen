package io.vertx.test.codegen.testtype;

import io.vertx.codegen.testmodel.TestDataObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public interface CollectionHolder<ClassTypeParam> {

  String String();
  ClassTypeParam ClassTypeParam();
  TestDataObject DataObject();
  JsonObject JsonObject();
  JsonArray JsonArray();

  List list();
  List<String> listOfString();
  List<ClassTypeParam> listOfClassTypeParam();
  <MethodTypeParam> List<MethodTypeParam> listOfMethodTypeParam();
  List<TestDataObject> listOfDataObject();
  List<JsonObject> listOfJsonObject();
  List<JsonArray> listOfJsonArray();

  Set set();
  Set<String> setOfString();
  Set<ClassTypeParam> setOfClassTypeParam();
  <MethodTypeParam> Set<MethodTypeParam> setOfMethodTypeParam();
  Set<TestDataObject> setOfDataObject();
  Set<JsonObject> setOfJsonObject();
  Set<JsonArray> setOfJsonArray();

  Map map();
  Map<String, String> mapOfString();
  Map<String, ClassTypeParam> mapOfClassTypeParam();
  <MethodTypeParam> Map<String, MethodTypeParam> mapOfMethodTypeParam();
  Map<String, TestDataObject> mapOfDataObject();
  Map<String, JsonObject> mapOfJsonObject();
  Map<String, JsonArray> mapOfJsonArray();
}
