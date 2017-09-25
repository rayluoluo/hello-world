package com.github.rayluoluo.snippet.s06testoverwrite;

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}
