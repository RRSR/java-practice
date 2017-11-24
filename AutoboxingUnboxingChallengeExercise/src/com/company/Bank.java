package com.company;

import java.util.ArrayList;

/**
 * Created by Raj Rathore on 22-Nov-17
 */
public class Bank {

  private String name;
  private ArrayList<Branch> branches;

  Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<>();
  }

  String getName() {
    return name;
  }

  boolean addBranch(Branch branch) {
    return !findBranch(branch) && branches.add(branch);
  }

  private boolean findBranch(Branch branch) {
    for (Branch branch1 : branches) {
      if (branch1 == branch) {
        return true;
      }
    }
    return false;
  }

  Branch findBranch(String branchName) {
    for (Branch branch1 : branches) {
      if (branch1.getName().equalsIgnoreCase(branchName)) {
        return branch1;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "Bank{" +
        "name='" + name + '\'' +
        ", branches=" + branches +
        '}';
  }
}
