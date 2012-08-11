package com.eclipsesource.examples.virgo.blueprint.sql;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.util.StringUtils;

public class SqlCommandProvider {

	private JdbcOperations jdbcTemplate;

	public void setJdbcTemplate(JdbcOperations jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void execute(String[] args) {
		String sql = StringUtils.arrayToDelimitedString(args, " ");
		jdbcTemplate.execute(sql);
	}

	public int queryForInt(String[] args) {
		String sql = StringUtils.arrayToDelimitedString(args, " ");
		return jdbcTemplate.queryForInt(sql);
	}
}
