package com.company;

import java.util.List;

/**
 * Created by Raj Rathore on 25-Nov-17
 */
public interface ISaveable {

  List<String> write();

  void read(List<String> savedValues);

}
