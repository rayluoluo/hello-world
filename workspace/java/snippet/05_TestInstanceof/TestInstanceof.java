public class TestInstanceof
{
  public void distribute(Person paramPerson)
  {
    if (!(paramPerson instanceof Graduate)) {
      if (!(paramPerson instanceof Student)) {}
    }
  }
}
