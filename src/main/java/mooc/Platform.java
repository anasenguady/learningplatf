package mooc;

import java.util.*;

public class Platform {
        
        public List<Enrollment> myEnroll = new ArrayList<>();
        public List<Person> myStudent = new ArrayList<>();
        public List<Course> myCours = new ArrayList<>();

	public Platform() {
         
	}

	/**
	 * Ajoute un cours à la liste de cours dispensés
	 * @param c le cours à ajouter (non null)
	 */
	public void addCourse(Course c) {
            
            if(null==c){
                    throw new IllegalArgumentException("Course is not null");
                    
            }
            Course c1 = new Course();
            myCours.add(c1);
           
	}

	/**
	 * @return les étudiants inscrits à l'université
	 */
	public Set<Person> students() {
            return(students());
		
	}

	/**
	 * @return les cours dispensés par l'université
	 */
	public Set<Course> courses() {
		return(courses());
	}

	/**
	 * Inscrire un étudiant à l'université
	 * @param s  l'étudiant à inscrire (non null)
	 */
	public void registerStudent(Person s) {
            
            
            if(null==s){
                throw new IllegalArgumentException("person is not null");
                
            }
            Person s1 = new Person();
            myStudent.add(s1);
                
                
                
	}

	/**
	 * Inscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 */
	public void enroll(Person s, Course c) throws Exception {
            
            
            if(null==s || null==c){
                throw new IllegalArgumentException("person and course are not null");
            
            }else{
                Enrollment e1=new Enrollment();
                myEnroll.add(e1);
                
            }
            
            
        
		
	}

	/**
	 * Désinscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws Exception si l'étudiant a déjà une note àce cours
	 */
	public void withdraw(Person s, Course c) throws Exception {
            throw new UnsupportedOperationException("Pas encore implémenté");
            }
            
            
            
		
	}

	/**
	 * Donner une note à un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @param  mark la note
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université,
	 * ou si l'étudiant a déjà une note pour ce cours
	 */
	public void setMark(Person s, Course c, int mark) throws Exception {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * Connaitre la note d'un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @return la note de l'étudiant pour le cours
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 * ou si l'étudiant n'a pas encore de note à ce cours
	 */
	public int getMark(Person s, Course c) throws Exception {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @param c le cours considéré
	 * @return les étudiants inscrits à ce cours
	 * @throws Exception si le cours n'est pas dispensé par l'université
	 */
	public Set<Person> studentsForCourse(Course c) throws Exception {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @param s l'étudiant considéré
	 * @return les cours auxquels un étudiant est incrit
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 */
	public Set<Course> coursesForStudent(Person s) throws Exception {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return les cours auxquels aucun étudiant n'est incrit
	 */
	public Set<Course> emptyCourses() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

}
