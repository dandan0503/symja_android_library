package org.matheclipse.core.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Supplier;

public interface IAssociation extends IASTAppendable {

	/**
	 * Append a <code>Rule(a,b)</code> or <code>RuleDelayed(a,b)</code> expression.
	 * 
	 * @param rule
	 */
	public void appendRule(IAST rule);

	/**
	 * Copy this association
	 */
	public IAssociation copy();

	/**
	 * Copy this association as empty association
	 */
	public IAssociation copyHead(final int intialCapacity);

	/**
	 * Return the key which points to the <code>position</code>.
	 * 
	 * @param position
	 * @return
	 */
	public IExpr getKey(int position);

	/**
	 * Return the rule at the given <code>position</code>.
	 * 
	 * @param position
	 * @return
	 */
	public IAST getRule(int position);

	/**
	 * Return the value associated to the <code>key</code>. If no value is available return
	 * <code>Missing("KeyAbsent", key)</code>
	 * 
	 * @param key
	 * @return
	 */
	public IExpr getValue(IExpr key);

	/**
	 * Return the value associated to the <code>key</code>. If no value is available return the
	 * <code>defaultValue</code>
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public IExpr getValue(IExpr key, Supplier<IExpr> defaultValue);

	/**
	 * Test if the <code>expr</code> is a key in this association.
	 * 
	 * @param expr
	 * @return
	 */
	public boolean isKey(IExpr expr);

	/**
	 * Get the keys of this association as a<code>List(key1, key2,...)</code>
	 * 
	 * @return
	 */
	public IASTMutable keys();

	/**
	 * Get the key names of this association as an ArrayList<code>key1, key2,...</code>
	 * 
	 * @return
	 */
	public ArrayList<String> keyNames();

	/**
	 * Return a new association sorted by the keys of the association.
	 * 
	 * @return the sorted association
	 */
	public IAssociation keySort();

	/**
	 * Return a new association has the key values sorted by the <code>comparator</code>.
	 * 
	 * @return the sorted association
	 */
	public IAssociation keySort(Comparator<IExpr> comparator);

	/**
	 * Return the list of rules <code>{a->b, c:>d, ...}</code> represented by this association.
	 */
	public IAST normal(boolean nilIfUnevaluated);

	/**
	 * Return the list of rules as a matrix or list
	 */
	public IAST matrixOrList();

	/**
	 * Return a new association sorted by the values of the association.
	 * 
	 * @return the sorted association
	 */
	public IAssociation sort();

	/**
	 * Return a new association sorted by the comparator.
	 * 
	 * @return the sorted association
	 */
	public IAssociation sort(Comparator<IExpr> comparator);

	/**
	 * Get the values of this association as a<code>List(value1, value2,...)</code>
	 * 
	 * @return
	 */
	public IASTMutable values();
}
