package com.tactfactory.javaniveau2.tps.tp2;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tactfactory.javaniveau2.tps.tp2.entities.Car;
import com.tactfactory.javaniveau2.tps.tp2.entities.User;
import com.tactfactory.javaniveau2.tps.tp2.utils.ItemsGenerator;

/**
 *
 * @author tactfactory
 *
 *  - Créer un programme qui permet, en utilisant la fonction "stream()" sur la variable users,
 *      d'afficher les informations suivantes :
 * 
 *
 *   	
 *    - 8 : La marque possédant le plus de voiture avec le nombre de voiture possédé
 *    - 9 : Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque
 *    -10 : La liste des utilisateurs triée par nom puis par prénom
 */
public class Tp2 {

  public static void main(String[] args) {
    List<User> users = ItemsGenerator.generateUsers();

    for (User user : users) {
      // System.out.println(user);
    	
    //total of users
      System.out.println(String.format("%s %d", "Nombre d'utilisateur :", users.size()));
      
      
      
      List<User> nbUsersA = users.stream().filter(x -> x.getFirstname().toUpperCase().charAt(0) == 'A').collect(Collectors.toList());
      users.stream();
      
      System.out.println(String.format("%s %d", "Nombre d'utilisateur commen�ant par A :", nbUsersA.size()));
      
      
      
      
      List<User> nbUsers5Char = users.stream().filter(x -> x.getFirstname().length() == 5 & x.getLastname().length() == 5).collect(Collectors.toList());
      users.stream();
      
      System.out.println(String.format("%s %d", "Nombre d'utilisateur dont le nom est le pr�nom on 5 char :", nbUsers5Char.size()));
      
      
      
      
      
      List<User> nbUsersFullNameCheck = users.stream().filter(x -> x.getFullName().length() >= 13 & x.getFullName().length() <= 16).collect(Collectors.toList());
      users.stream();
      
      System.out.println(String.format("%s %d", "Nombre d'utilisateur dont le fullName on entre 13 et 16 char :", nbUsersFullNameCheck.size()));
   
   
      
      
      
      List<User> nbUsersMarque1 = users.stream().filter(x -> x.getCar().getCarType().getName() == "marque1").collect(Collectors.toList());
      users.stream();
      
      System.out.println(String.format("%s %d", "Nombre d'utilisateur dont la voiture est de marque1 :", nbUsersMarque1.size()));
      
      
      
  
      
      Optional<User> carWithMoreKlm = users.stream().filter(x -> x.getCar().getMileage() > 0)
    	        .collect(Collectors.maxBy(Comparator.comparingInt(x -> (int)x.getCar().getMileage())));
      
      System.out.println("Voiture avec le plus haut kilom�trage");
      System.out.println(carWithMoreKlm.get().getCar().toString());
      
    }

    // 1 : Le nombre d'utilisateur
//    long nbUsers = users.stream();
//    System.out.println(String.format("%s %d", "Nombre d'utilisateur", nbUsers));

    // 2 : Le nombre d'utilisateur dans la première lettre du prénom commence par "a"
//    long nbUsersA = users.stream();
//    System.out.println(
//        String.format("%s %d", "Nombres d'utilisateur dans la première lettre du prénom commence par \"a\"", nbUsersA));

    // 3 : Le nombre d'utilisateur dont le nom et le prénom contienent exactement 5 caractères
//    long nbUsersFLName5 = users.stream();
//    System.out.println(String.format("%s %d",
//        "Les utilisateurs dont le nom et le prénom contienent exactement 5 caractères", nbUsersFLName5));

    // 4 : Le nombre d'utilisateur dont le full name contient entre 13 et 16 caractères
//    long nbUsersFullname1316 = users.stream();
//    System.out.println(String.format("%s %d", "Les utilisateurs dont le full name contient entre 13 et 16 caractères",
//        nbUsersFullname1316));

    // 5 : Les utilisateurs possédant une voiture de la marque "marque1"
//    List<User> usersCarMarque1 = users.stream();
//    System.out.println("Les utilisateurs possédant une voiture de la marque \"marque1\"");
//    for (User user : usersCarMarque1) {
//      System.out.println(String.format("\t%s", user));
//    }

    // 6 : La première voiture avec le plus haut kilométrage
//    Car carMaxMileage = users.stream();
//    System.out.println(String.format("%s %s", "La voiture avec le plus haut kilométrage", carMaxMileage));

    // 7 : La liste des voitures avec le plus haut kilométrage
//    List<Car> carMaxMileages = users.stream();
//    System.out.println("La liste des voitures avec le plus haut kilométrage");
//    for (Car car : carMaxMileages) {
//      System.out.println(String.format("\t%s", car));
//    }

    // 8 : La marque possédant le plus de voiture avec le nombre de voiture possédé
//    Entry<String, List<User>> markMaxCar = users.stream();
//    System.out.println(String.format("%s est %s avec %d voitures", "La marque possédant le plus de voiture",
//        markMaxCar.getKey(), markMaxCar.getValue().size()));

    // 9 : Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque
//    int minCars = users.stream();
//    List<Entry<String, List<Car>>> markMinCars = users.stream();
//    System.out.println("Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque");
//    for (Entry<String, List<Car>> entry : markMinCars) {
//      System.out.println("\t" + entry.getKey() + " :");
//      for (Car car : entry.getValue()) {
//        System.out.println("\t\t" + car);
//      }
//    }

    // 10 : La liste des utilisateurs triée par nom puis par prénom
//    List<User> sortedUsers = users.stream();
//    System.out.println("La liste des utilisateurs triée par nom puis par prénom");
//    for (User user : sortedUsers) {
//      System.out.println("\t" + user);
//    }
  }

}
