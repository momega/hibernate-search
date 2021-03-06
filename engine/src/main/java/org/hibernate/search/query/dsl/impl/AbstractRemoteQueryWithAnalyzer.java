/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.query.dsl.impl;

import org.apache.lucene.search.Query;
import org.hibernate.search.analyzer.impl.RemoteAnalyzerReference;

/**
 * An abstract class for {@code Query} which wraps the analyzer reference information.
 *
 * @author Guillaume Smet
 */
public abstract class AbstractRemoteQueryWithAnalyzer extends Query {

	private RemoteAnalyzerReference analyzerReference;

	protected AbstractRemoteQueryWithAnalyzer(RemoteAnalyzerReference analyzerReference) {
		this.analyzerReference = analyzerReference;
	}

	public RemoteAnalyzerReference getAnalyzerReference() {
		return analyzerReference;
	}

}
