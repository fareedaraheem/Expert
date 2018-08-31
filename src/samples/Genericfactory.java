package samples;

/**
 * Created by expert on 8/30/18.
 */
public class Genericfactory<T> {

    Class<T> c;
    public Genericfactory(Class<T> c){
        this.c=c;
    }

    public Class<T> getObjectType(){
        return c;
    }

    public T getObject() throws IllegalAccessException,InstantiationException{

        try{
            return(T) getObjectType().newInstance();
        }
        catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws InstantiationException,IllegalAccessException {

        Productgeneric p=new Genericfactory<Soap>(Soap.class).getObject();
        System.out.println(p.getName());

        p=new Genericfactory<Oil>(Oil.class).getObject();
        System.out.println(p.getName());
    }



}
