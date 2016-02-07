<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" indent="yes" encoding="euc-kr"></xsl:output>
	<xsl:template match="/books"><!-- method에 books란 시작태그를 쓴다. -->
		<!-- TODO: Auto-generated template -->
		<ul>
			<xsl:for-each select="book">
				<li><b><xsl:value-of select="title"/></b>
				(<xsl:value-of select="author"></xsl:value-of>)
				</li>
			</xsl:for-each>
		</ul>
	</xsl:template>
</xsl:stylesheet>