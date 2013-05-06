/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author dai-mac
 */
@ManagedBean
@RequestScoped
public class Hello {

	//出力テキスト用
	private String out;

	//入力テキスト用
	private String name;

	//----------------------------------------------------------
	//アクセサメソッド
	public String getOut() {
		return out;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//----------------------------------------------------------


	//ボタンクリック
	public String click(){
		out = "はろー「" + name + "」さん";
		return null;
	}
    /**
     * Creates a new instance of Hello
     */
    public Hello() {
    }
}
