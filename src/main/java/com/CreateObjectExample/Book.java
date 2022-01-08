package com.CreateObjectExample;

/**@author zzq
 * @date  2021-3-16 20:54:30 
 * @description  
 */

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable, Cloneable{

    private static final long serialVersionUID = -6212470156629515269L;

    /**书名*/
    private String name;

    /**作者*/
    private List<String> authors;

    /**ISBN*/
    private String isbn;

    /**价格*/
    private float price;

    public Book() {
    }

    /**
     * @param name
     * @param authors
     * @param isbn
     * @param price
     */
    public Book(String name, List<String> authors, String isbn, float price) {
        this.name = name;
        this.authors = authors;
        this.isbn = isbn;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the authors
     */
    public List<String> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

   
    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=" + authors + ", isbn=" + isbn + ", price="
                + price + "]";
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return (Book)super.clone();
	}
    
    
    

}