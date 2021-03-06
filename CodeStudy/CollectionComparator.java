//List<String> listName = new ArrayList<String>();

Collections.sort(listName, new Comparator<String>(){
  @Override
  public int compare(String o1, String o2){
    return o1.compareTo(o2);
  }
}); //오름차순
