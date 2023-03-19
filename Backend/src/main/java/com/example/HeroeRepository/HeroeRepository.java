
import org.springframework.stereotype.Repository;

public interface HeroeRepository<Heroe, Serializable> extends JpaRepository<Heroe, Serializable>{
	
	public abstract Heroe findById(int id);
	
}