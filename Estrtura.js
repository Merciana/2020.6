let p;

beforeEach(() => {
    p = PilhaAB(10);
});

test("topo da pilha", () => {
    q.pilhaA('A');
    q.pilhaB('B');
    expect(p.topoA).toBe(0);
    expect(p.topoB).toBe(9);
});

test("Vazio", () => {
    expect(p.tiraA).toThrowError();
    expect(p.tiraB).toThrowError();
});

test("Vazio", ()=> {
    p.topoA('A');
    p.topoB('B');
    p.topoA('A');
    p.topoB('B');
    p.topoA('A');
    p.topoB('B');
    p.topoA('A');
    p.topoB('B');
    p.topoA('A');
    expect(q.topoA('C')).toBe('');
    expect(q.topoB('C')).toBe('C');
})

