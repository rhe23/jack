package com.rapleaf.jack.queries;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;

public class Records implements Iterable<Record> {
  private final List<Record> records;

  Records() {
    this.records = Lists.newArrayList();
  }

  void addRecord(Record record) {
    records.add(record);
  }

  public boolean isEmpty() {
    return records.isEmpty();
  }

  public int size() {
    return records.size();
  }

  public Record get(int index) {
    return records.get(index);
  }

  public List<Integer> getInts(Column column) {
    List<Integer> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getInt(column));
    }
    return results;
  }

  public List<Integer> getIntsFromLongs(Column column) {
    List<Integer> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getIntFromLong(column));
    }
    return results;
  }

  public List<Long> getLongs(Column column) {
    List<Long> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getLong(column));
    }
    return results;
  }

  public List<String> getStrings(Column column) {
    List<String> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getString(column));
    }
    return results;
  }

  public List<byte[]> getByteArrays(Column column) {
    List<byte[]> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getByteArray(column));
    }
    return results;
  }

  public List<Double> getDoubles(Column column) {
    List<Double> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getDouble(column));
    }
    return results;
  }

  public List<Boolean> getBooleans(Column column) {
    List<Boolean> results = Lists.newArrayList();
    for (Record record : records) {
      results.add(record.getBoolean(column));
    }
    return results;
  }

  @Override
  public Iterator<Record> iterator() {
    return records.iterator();
  }

  @Override
  public int hashCode() {
    return records.hashCode();
  }

  @Override
  public boolean equals(Object that) {
    return that instanceof Records && ((Records)that).records.equals(this.records);
  }
}
